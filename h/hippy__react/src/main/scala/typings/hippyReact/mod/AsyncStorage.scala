package typings.hippyReact.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncStorage extends StObject {
  
  def getAllKeys(): js.Promise[js.Array[String]] = js.native
  
  def getItem(key: String): js.Promise[String] = js.native
  
  def multiGet(keys: js.Array[String]): js.Promise[js.Array[String]] = js.native
  
  def multiRemove(keys: js.Array[String]): js.Promise[Unit] = js.native
  
  def multiSet(keys: StringDictionary[String | Double]): js.Promise[Unit] = js.native
  
  def removeItem(key: String): js.Promise[Unit] = js.native
  
  def setItem(key: String, value: String): js.Promise[Unit] = js.native
  def setItem(key: String, value: Double): js.Promise[Unit] = js.native
}
