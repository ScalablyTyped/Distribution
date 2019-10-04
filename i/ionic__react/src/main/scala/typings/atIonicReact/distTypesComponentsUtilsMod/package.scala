package typings.atIonicReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesComponentsUtilsMod {
  import typings.atIonicReact.atIonicReactStrings.style
  import typings.atIonicReact.distTypesComponentsIonicReactPropsMod.IonicReactProps
  import typings.react.reactMod.HTMLAttributes
  import typings.std.Omit

  type IonicReactExternalProps[PropType, ElementType] = PropType with (Omit[HTMLAttributes[ElementType], style]) with IonicReactProps
}
