package typings.less.Less

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportManager extends StObject {
  
  var contents: StringDictionary[String]
}
object ImportManager {
  
  inline def apply(contents: StringDictionary[String]): ImportManager = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportManager]
  }
  
  extension [Self <: ImportManager](x: Self) {
    
    inline def setContents(value: StringDictionary[String]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
  }
}
