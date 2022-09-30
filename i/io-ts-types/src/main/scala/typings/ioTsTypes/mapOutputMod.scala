package typings.ioTsTypes

import typings.ioTs.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapOutputMod {
  
  @JSImport("io-ts-types/lib/mapOutput", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mapOutput[A, O, I, P](codec: Type_[A, O, I], f: js.Function1[/* p */ O, P]): Type_[A, P, I] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapOutput")(codec.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Type_[A, P, I]]
  inline def mapOutput[A, O, I, P](codec: Type_[A, O, I], f: js.Function1[/* p */ O, P], name: String): Type_[A, P, I] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapOutput")(codec.asInstanceOf[js.Any], f.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Type_[A, P, I]]
}
