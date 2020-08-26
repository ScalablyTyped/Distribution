package typings.jsonld.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compact
  extends Common
     with ExpMap {
  var appropriate: js.UndefOr[Boolean] = js.native
  var compactArrays: js.UndefOr[Boolean] = js.native
  var compactToRelative: js.UndefOr[Boolean] = js.native
  // TODO: Figure out type of info
  var compactionMap: js.UndefOr[js.Function1[/* info */ js.Any, Unit]] = js.native
  var expansion: js.UndefOr[Boolean] = js.native
  var framing: js.UndefOr[Boolean] = js.native
  var graph: js.UndefOr[Boolean] = js.native
  var skipExpansion: js.UndefOr[Boolean] = js.native
}

object Compact {
  @scala.inline
  def apply(): Compact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Compact]
  }
  @scala.inline
  implicit class CompactOps[Self <: Compact] (val x: Self) extends AnyVal {
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
    def setAppropriate(value: Boolean): Self = this.set("appropriate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppropriate: Self = this.set("appropriate", js.undefined)
    @scala.inline
    def setCompactArrays(value: Boolean): Self = this.set("compactArrays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompactArrays: Self = this.set("compactArrays", js.undefined)
    @scala.inline
    def setCompactToRelative(value: Boolean): Self = this.set("compactToRelative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompactToRelative: Self = this.set("compactToRelative", js.undefined)
    @scala.inline
    def setCompactionMap(value: /* info */ js.Any => Unit): Self = this.set("compactionMap", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCompactionMap: Self = this.set("compactionMap", js.undefined)
    @scala.inline
    def setExpansion(value: Boolean): Self = this.set("expansion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpansion: Self = this.set("expansion", js.undefined)
    @scala.inline
    def setFraming(value: Boolean): Self = this.set("framing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFraming: Self = this.set("framing", js.undefined)
    @scala.inline
    def setGraph(value: Boolean): Self = this.set("graph", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraph: Self = this.set("graph", js.undefined)
    @scala.inline
    def setSkipExpansion(value: Boolean): Self = this.set("skipExpansion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipExpansion: Self = this.set("skipExpansion", js.undefined)
  }
  
}

