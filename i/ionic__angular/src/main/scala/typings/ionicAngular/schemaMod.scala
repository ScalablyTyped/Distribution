package typings.ionicAngular

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemaMod {
  
  trait Schema extends StObject {
    
    var project: js.UndefOr[String] = js.undefined
  }
  object Schema {
    
    @scala.inline
    def apply(): Schema = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Schema]
    }
    
    @scala.inline
    implicit class SchemaMutableBuilder[Self <: Schema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    }
  }
}
