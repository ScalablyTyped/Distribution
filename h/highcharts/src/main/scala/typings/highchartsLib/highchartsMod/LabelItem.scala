package typings
package highchartsLib.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelItem extends js.Object {
  var html: java.lang.String
  var style: CSSObject
}

object LabelItem {
  @scala.inline
  def apply(html: java.lang.String, style: CSSObject): LabelItem = {
    val __obj = js.Dynamic.literal(html = html, style = style)
  
    __obj.asInstanceOf[LabelItem]
  }
}

