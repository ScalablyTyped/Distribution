package typings.jsmediatags

import typings.jsmediatags.typesMod.ByteArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object byteArrayUtilsMod {
  
  @JSImport("jsmediatags/build2/ByteArrayUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bin(string: String): ByteArray = ^.asInstanceOf[js.Dynamic].applyDynamic("bin")(string.asInstanceOf[js.Any]).asInstanceOf[ByteArray]
  
  inline def getInteger24(number: Double): ByteArray = ^.asInstanceOf[js.Dynamic].applyDynamic("getInteger24")(number.asInstanceOf[js.Any]).asInstanceOf[ByteArray]
  
  inline def getInteger32(number: Double): ByteArray = ^.asInstanceOf[js.Dynamic].applyDynamic("getInteger32")(number.asInstanceOf[js.Any]).asInstanceOf[ByteArray]
  
  inline def getSynchsafeInteger32(number: Double): ByteArray = ^.asInstanceOf[js.Dynamic].applyDynamic("getSynchsafeInteger32")(number.asInstanceOf[js.Any]).asInstanceOf[ByteArray]
  
  inline def pad(array: js.Array[Any], size: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(array.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
}
