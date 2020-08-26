package typings.jsdevtoolsFilePathFilter.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * A function that maps each filtered item to a file path.  This allows you to filter things
    * other than strings.
    *
    * Defaults to a function that returns the first argument as a string.
    */
  var map: js.UndefOr[MapFunction] = js.native
  /**
    * The path separator. This allows you to filter paths from
    * other operating systems (e.g. filtering Windows paths on a Mac).
    *
    * Defaults to the default path separtor for the host OS.
    */
  var sep: js.UndefOr[String] = js.native
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
    def setMap(value: /* repeated */ js.Any => String): Self = this.set("map", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setSep(value: String): Self = this.set("sep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSep: Self = this.set("sep", js.undefined)
  }
  
}

