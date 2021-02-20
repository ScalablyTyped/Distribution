package typings.ink

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.TopLevel
import typings.ink.anon.Children
import typings.ink.anon.ExceptChalkInstancelevel
import typings.react.mod.NamedExoticComponent
import typings.std.Partial
import typings.std.Record
import typings.typeFest.exceptMod.Except
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorMod extends Shortcut {
  
  @JSImport("ink/build/components/Color", JSImport.Default)
  @js.native
  val default: NamedExoticComponent[Props] = js.native
  
  type ChalkBooleanProps = Record[Colors, Boolean]
  
  type ChalkFunctionProps = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof ink.ink/build/components/Color.ChalkFunctions ]: std.Parameters<ink.ink/build/components/Color.ChalkFunctions[K]> extends [string]? string : std.Parameters<ink.ink/build/components/Color.ChalkFunctions[K]>}
    */ typings.ink.inkStrings.ChalkFunctionProps with TopLevel[js.Any]
  
  type ChalkFunctions = Except[ExceptChalkInstancelevel, Colors]
  
  type ChalkProps = Partial[ChalkBooleanProps with ChalkFunctionProps]
  
  type Colors = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof chalk.ForegroundColor */ js.Any
  
  type Props = ChalkProps with Children
  
  type _To = NamedExoticComponent[Props]
  
  /* This means you don't have to write `default`, but can instead just say `colorMod.foo` */
  override def _to: NamedExoticComponent[Props] = default
}
