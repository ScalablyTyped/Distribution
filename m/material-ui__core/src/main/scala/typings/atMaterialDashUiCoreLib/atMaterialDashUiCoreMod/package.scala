package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atMaterialDashUiCoreMod {
  type ConsistentWith[DecorationTargetProps, InjectedProps] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.ConsistentWith with js.Any
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  type Overwrite[T, U] = (Omit[T, java.lang.String]) with U
  type PropInjector[InjectedProps, AdditionalProps] = js.Function1[
    /* component */ js.Any, 
    reactLib.reactMod.ComponentType[
      (Omit[
        reactLib.reactMod.Global.JSXNs.LibraryManagedAttributes[_, PropsOf[_]], 
        java.lang.String
      ]) with AdditionalProps
    ]
  ]
  type PropsOf[C] = /* import warning: ImportType.apply Failed type conversion: react.react.Global.JSX.IntrinsicElements[C] */ js.Any
  type StandardProps[C, ClassKey /* <: java.lang.String */, Removals /* <: java.lang.String */] = (Omit[C, atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.classes | Removals]) with atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[ClassKey] with atMaterialDashUiCoreLib.Anon_ClassName
}
