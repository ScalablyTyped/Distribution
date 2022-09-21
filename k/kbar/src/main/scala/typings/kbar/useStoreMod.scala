package typings.kbar

import typings.kbar.typesMod.IKBarContext
import typings.kbar.typesMod.KBarProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useStoreMod {
  
  @JSImport("kbar/lib/useStore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useStore(props: useStoreProps): IKBarContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useStore")(props.asInstanceOf[js.Any]).asInstanceOf[IKBarContext]
  
  type useStoreProps = KBarProviderProps
}
