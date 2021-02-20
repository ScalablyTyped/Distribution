package typings.klawSync

import typings.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ReaddirSync extends StObject {
    
    def readdirSync(path: String): js.Array[String] = js.native
    
    def statSync(path: String): Stats = js.native
  }
  object ReaddirSync {
    
    @scala.inline
    def apply(readdirSync: String => js.Array[String], statSync: String => Stats): ReaddirSync = {
      val __obj = js.Dynamic.literal(readdirSync = js.Any.fromFunction1(readdirSync), statSync = js.Any.fromFunction1(statSync))
      __obj.asInstanceOf[ReaddirSync]
    }
    
    @scala.inline
    implicit class ReaddirSyncMutableBuilder[Self <: ReaddirSync] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReaddirSync(value: String => js.Array[String]): Self = StObject.set(x, "readdirSync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStatSync(value: String => Stats): Self = StObject.set(x, "statSync", js.Any.fromFunction1(value))
    }
  }
}
