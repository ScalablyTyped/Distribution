package typings.gotResume.mod

import typings.got.mod.GotOptions
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferOptions extends js.Object {
  /** Number of attempts to make before failing (0 for no limit). */
  var attempts: js.UndefOr[Double] = js.native
  /** Total number of attempts to make before failing (0 for no limit). */
  var attemptsTotal: js.UndefOr[Double] = js.native
  /**
    * Function called with `backoff(attempt, transfer)` and should return milliseconds to wait
    * before next attempt.
    */
  var backoff: js.UndefOr[js.Function2[/* attempt */ Double, /* transfer */ Transfer, Double]] = js.native
  /** Options to pass to `got` module. */
  var got: js.UndefOr[GotOptions[String | Null]] = js.native
  /**
    * Length of transfer
    * (NB is actually range end - does not take into account options.offset).
    */
  var length: js.UndefOr[Double] = js.native
  /** Function to call with logging information. */
  var log: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  /** `true` to disable gzip encoding on first request in order to get length. */
  var needLength: js.UndefOr[Boolean] = js.native
  /** Number of bytes at start of file to skip. */
  var offset: js.UndefOr[Double] = js.native
  /**
    * Function to call before HTTP requests. Is passed `transfer` object, should set
    * `transfer.url` and `transfer.gotOptions` and return a promise.
    */
  var pre: js.UndefOr[js.Function1[/* transfer */ Transfer, js.Promise[Unit]]] = js.native
  /** Transform stream to pass result through. */
  var transform: js.UndefOr[Transform] = js.native
  /** URL (alternative way to provide). */
  var url: js.UndefOr[String] = js.native
}

object TransferOptions {
  @scala.inline
  def apply(): TransferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferOptions]
  }
  @scala.inline
  implicit class TransferOptionsOps[Self <: TransferOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttempts(value: Double): Self = this.set("attempts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttempts: Self = this.set("attempts", js.undefined)
    @scala.inline
    def setAttemptsTotal(value: Double): Self = this.set("attemptsTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttemptsTotal: Self = this.set("attemptsTotal", js.undefined)
    @scala.inline
    def setBackoff(value: (/* attempt */ Double, /* transfer */ Transfer) => Double): Self = this.set("backoff", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBackoff: Self = this.set("backoff", js.undefined)
    @scala.inline
    def setGot(value: GotOptions[String | Null]): Self = this.set("got", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGot: Self = this.set("got", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setLog(value: /* repeated */ js.Any => Unit): Self = this.set("log", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    @scala.inline
    def setNeedLength(value: Boolean): Self = this.set("needLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedLength: Self = this.set("needLength", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setPre(value: /* transfer */ Transfer => js.Promise[Unit]): Self = this.set("pre", js.Any.fromFunction1(value))
    @scala.inline
    def deletePre: Self = this.set("pre", js.undefined)
    @scala.inline
    def setTransform(value: Transform): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

