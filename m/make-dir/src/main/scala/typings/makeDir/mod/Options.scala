package typings.makeDir.mod

import typings.makeDir.anon.Typeoffs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
  		Use a custom `fs` implementation. For example [`graceful-fs`](https://github.com/isaacs/node-graceful-fs).
  		Using a custom `fs` implementation will block the use of the native `recursive` option if `fs.mkdir` or `fs.mkdirSync` is not the native function.
  		@default require('fs')
  		*/
  val fs: js.UndefOr[Typeoffs] = js.native
  /**
  		Directory [permissions](https://x-team.com/blog/file-system-permissions-umask-node-js/).
  		@default 0o777
  		*/
  val mode: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setFs(value: Typeoffs): Self = this.set("fs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFs: Self = this.set("fs", js.undefined)
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
  
}

