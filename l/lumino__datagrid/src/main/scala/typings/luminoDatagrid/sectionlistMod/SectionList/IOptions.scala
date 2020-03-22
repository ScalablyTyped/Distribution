package typings.luminoDatagrid.sectionlistMod.SectionList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a section list.
  */
trait IOptions extends js.Object {
  /**
    * The size of new sections added to the list.
    */
  var defaultSize: Double
}

object IOptions {
  @scala.inline
  def apply(defaultSize: Double): IOptions = {
    val __obj = js.Dynamic.literal(defaultSize = defaultSize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
}

