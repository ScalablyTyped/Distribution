package typings.ioTsTypes

import org.scalablytyped.runtime.TopLevel
import typings.ioTs.mod.ExactType
import typings.ioTs.mod.InterfaceType
import typings.ioTs.mod.TypeOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getLensesMod {
  
  @JSImport("io-ts-types/lib/getLenses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLenses[C /* <: HasLenses */](codec: C): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof io-ts.io-ts.TypeOf<C> ]: monocle-ts.monocle-ts.Lens<io-ts.io-ts.TypeOf<C>, io-ts.io-ts.TypeOf<C>[K]>}
    */ typings.ioTsTypes.ioTsTypesStrings.getLenses & TopLevel[TypeOf[C]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLenses")(codec.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof io-ts.io-ts.TypeOf<C> ]: monocle-ts.monocle-ts.Lens<io-ts.io-ts.TypeOf<C>, io-ts.io-ts.TypeOf<C>[K]>}
    */ typings.ioTsTypes.ioTsTypesStrings.getLenses & TopLevel[TypeOf[C]]]
  
  type ExactHasLenses = ExactType[HasLenses, Any, Any, Any]
  
  type HasLenses = (InterfaceType[Any, Any, Any, Any]) | Any
}
