package typings.jqueryFancytree.Fancytree.Extensions

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Define table-extension options
  */
trait Table
  extends /**
  * Support misc options
  */
/* key */ StringDictionary[js.Any] {
  /**
    * Render the checkboxes into the this column index (default: nodeColumnIdx)
    */
  var checkboxColumnIdx: js.Any
  /**
    * Indent every node level by 16px; default: 16
    */
  var indentation: Double
  /**
    * Render node expander, icon, and title to this column (default: 0)
    */
  var nodeColumnIdx: Double
}

object Table {
  @scala.inline
  def apply(
    checkboxColumnIdx: js.Any,
    indentation: Double,
    nodeColumnIdx: Double,
    StringDictionary: /**
    * Support misc options
    */
  /* key */ StringDictionary[js.Any] = null
  ): Table = {
    val __obj = js.Dynamic.literal(checkboxColumnIdx = checkboxColumnIdx.asInstanceOf[js.Any], indentation = indentation.asInstanceOf[js.Any], nodeColumnIdx = nodeColumnIdx.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Table]
  }
}

