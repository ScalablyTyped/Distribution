package typings.klawSync

import typings.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ReaddirSync extends StObject {
    
    def readdirSync(path: String): js.Array[String]
    
    def statSync(path: String): Stats
  }
  object ReaddirSync {
    
    inline def apply(readdirSync: String => js.Array[String], statSync: String => Stats): ReaddirSync = {
      val __obj = js.Dynamic.literal(readdirSync = js.Any.fromFunction1(readdirSync), statSync = js.Any.fromFunction1(statSync))
      __obj.asInstanceOf[ReaddirSync]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReaddirSync] (val x: Self) extends AnyVal {
      
      inline def setReaddirSync(value: String => js.Array[String]): Self = StObject.set(x, "readdirSync", js.Any.fromFunction1(value))
      
      inline def setStatSync(value: String => Stats): Self = StObject.set(x, "statSync", js.Any.fromFunction1(value))
    }
  }
}
