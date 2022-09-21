package typings.inputFormat

import org.scalablytyped.runtime.Shortcut
import typings.inputFormat.anon.Format
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactMod extends Shortcut {
  
  @JSImport("input-format/react", JSImport.Default)
  @js.native
  val default: ReactInputComponent[DefaultInputComponentProps] = js.native
  
  type DefaultInputComponentProps = InputHTMLAttributes[HTMLInputElement]
  
  type InputComponent[InputComponentProps] = js.Function1[/* props */ InputComponentProps, Element]
  
  type Props[InputComponentProps] = InputComponentProps & Format[InputComponentProps]
  
  // React TypeScript Cheatsheet doesn't recommend using React.FunctionalComponent.
  // https://react-typescript-cheatsheet.netlify.app/docs/basic/getting-started/function_components
  // declare const ReactInput: React.FC<Props>;
  type ReactInputComponent[InputComponentProps] = js.Function1[/* props */ Props[InputComponentProps], Element]
  
  type _To = ReactInputComponent[DefaultInputComponentProps]
  
  /* This means you don't have to write `default`, but can instead just say `reactMod.foo` */
  override def _to: ReactInputComponent[DefaultInputComponentProps] = default
}
