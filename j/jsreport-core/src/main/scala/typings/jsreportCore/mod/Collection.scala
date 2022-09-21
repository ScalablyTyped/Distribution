package typings.jsreportCore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Collection extends StObject {
  
  def find(query: StringDictionary[Any]): js.Promise[js.Array[js.Object]] = js.native
  
  def insert(obj: js.Object): js.Promise[js.Object] = js.native
  
  def remove(query: StringDictionary[Any]): js.Promise[Any] = js.native
  
  def update(query: StringDictionary[Any], update: js.Object): js.Promise[Any] = js.native
  def update(query: StringDictionary[Any], update: js.Object, options: js.Object): js.Promise[Any] = js.native
}
