package typings.ioTsTypes

import typings.ioTs.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWithEncodeMod {
  
  @JSImport("io-ts-types/lib/withEncode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withEncode[A, O, I, P](codec: Type_[A, O, I], encode: js.Function1[/* a */ A, P]): Type_[A, P, I] = (^.asInstanceOf[js.Dynamic].applyDynamic("withEncode")(codec.asInstanceOf[js.Any], encode.asInstanceOf[js.Any])).asInstanceOf[Type_[A, P, I]]
  inline def withEncode[A, O, I, P](codec: Type_[A, O, I], encode: js.Function1[/* a */ A, P], name: String): Type_[A, P, I] = (^.asInstanceOf[js.Dynamic].applyDynamic("withEncode")(codec.asInstanceOf[js.Any], encode.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Type_[A, P, I]]
}
