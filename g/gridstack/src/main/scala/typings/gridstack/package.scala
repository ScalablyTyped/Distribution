package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gridstack {
  /* Other items in https://github.com/gridstack/gridstack.js/blob/develop/doc/README.md
    * Grid attributes
    * Item attributes
    * Events
    */
  type GridStackElement = java.lang.String | typings.std.HTMLElement
  /* Rewritten from type alias, can be one of: 
    - typings.gridstack.gridstackStrings.added
    - typings.gridstack.gridstackStrings.change
    - typings.gridstack.gridstackStrings.disable
    - typings.gridstack.gridstackStrings.dragstart
    - typings.gridstack.gridstackStrings.dragstop
    - typings.gridstack.gridstackStrings.dropped
    - typings.gridstack.gridstackStrings.enable
    - typings.gridstack.gridstackStrings.removed
    - typings.gridstack.gridstackStrings.resize
    - typings.gridstack.gridstackStrings.resizestart
    - typings.gridstack.gridstackStrings.gsresizestop
    - java.lang.String
  */
  type GridStackEvent = typings.gridstack._GridStackEvent | java.lang.String
}
