package typings.jupyterlabUiComponents.labiconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object LabIcon {
  /**
    * A type that maybe can be resolved to a LabIcon instance.
    */
  type IMaybeResolvable = js.UndefOr[
    typings.jupyterlabUiComponents.labiconMod.LabIcon.IResolvable | typings.luminoVirtualdom.mod.VirtualElement.IRenderer
  ]
  /**
    * The complete type of the React component stored in the .react
    * field of a LabIcon.
    */
  type IReact = typings.react.mod.ForwardRefExoticComponent[typings.jupyterlabUiComponents.labiconMod.LabIcon.IReactProps]
  /**
    * The properties that can be passed into the React component stored in
    * the .react field of a LabIcon.
    */
  type IReactProps = typings.jupyterlabUiComponents.labiconMod.LabIcon.IProps with typings.react.mod.RefAttributes[typings.std.SVGElement]
  /**
    * The type of the svg node ref that can be passed into icon React components
    */
  type IReactRef = typings.react.mod.RefObject[typings.std.SVGElement]
  /********
    * types *
    *********/
  /**
    * A type that can be resolved to a LabIcon instance.
    */
  type IResolvable = java.lang.String | typings.jupyterlabUiComponents.IIconPartialIRenderer
}
