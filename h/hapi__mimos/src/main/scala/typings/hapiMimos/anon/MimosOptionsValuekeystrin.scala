package typings.hapiMimos.anon

import org.scalablytyped.runtime.StringDictionary
import typings.mimeDb.mod.MimeSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @hapi/mimos.@hapi/mimos.MimosOptionsValue & {[key: string] : any} */
@js.native
trait MimosOptionsValuekeystrin
  extends /* key */ StringDictionary[js.Any] {
  /** The default charset associated with this type, if any. */
  val charset: js.UndefOr[String] = js.native
  /** Whether a file of this type can be gzipped. */
  val compressible: js.UndefOr[Boolean] = js.native
  /** Known extensions associated with this mime type. */
  val extensions: js.UndefOr[js.Array[String]] = js.native
  /**
    * Where the mime type is defined.
    * If not set, it's probably a custom media type.
    */
  val source: js.UndefOr[MimeSource] = js.native
  /**
    * Specify the type value of result objects, defaults to key.
    */
  var `type`: js.UndefOr[String] = js.native
}

object MimosOptionsValuekeystrin {
  @scala.inline
  def apply(): MimosOptionsValuekeystrin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MimosOptionsValuekeystrin]
  }
  @scala.inline
  implicit class MimosOptionsValuekeystrinOps[Self <: MimosOptionsValuekeystrin] (val x: Self) extends AnyVal {
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
    def setCharset(value: String): Self = this.set("charset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharset: Self = this.set("charset", js.undefined)
    @scala.inline
    def setCompressible(value: Boolean): Self = this.set("compressible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompressible: Self = this.set("compressible", js.undefined)
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setSource(value: MimeSource): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

