package typings.materialGridList.constantsMod

import typings.materialGridList.materialGridListStrings.`Dotmdc-grid-list__tiles`
import typings.materialGridList.materialGridListStrings.`Dotmdc-grid-tile`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MDCStrings * / any */ @js.native
trait strings extends js.Object {
  var TILES_SELECTOR: `Dotmdc-grid-list__tiles` = js.native
  var TILE_SELECTOR: `Dotmdc-grid-tile` = js.native
}

object strings {
  @scala.inline
  def apply(TILES_SELECTOR: `Dotmdc-grid-list__tiles`, TILE_SELECTOR: `Dotmdc-grid-tile`): strings = {
    val __obj = js.Dynamic.literal(TILES_SELECTOR = TILES_SELECTOR.asInstanceOf[js.Any], TILE_SELECTOR = TILE_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[strings]
  }
  @scala.inline
  implicit class stringsOps[Self <: strings] (val x: Self) extends AnyVal {
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
    def setTILES_SELECTOR(value: `Dotmdc-grid-list__tiles`): Self = this.set("TILES_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setTILE_SELECTOR(value: `Dotmdc-grid-tile`): Self = this.set("TILE_SELECTOR", value.asInstanceOf[js.Any])
  }
  
}

