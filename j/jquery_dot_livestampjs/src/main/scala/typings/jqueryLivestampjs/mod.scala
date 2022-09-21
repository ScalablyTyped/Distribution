package typings.jqueryLivestampjs

import typings.moment.mod.Moment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait LivestampGlobal extends StObject {
    
    def interval(): Double = js.native
    def interval(interval: Double): Unit = js.native
    
    def pause(): Unit = js.native
    
    def resume(): Unit = js.native
    
    def update(): Unit = js.native
  }
  
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      def livestamp(date: js.Date): JQuery = js.native
      def livestamp(moment: Moment): JQuery = js.native
      def livestamp(timestamp: String): JQuery = js.native
      def livestamp(timestamp: Double): JQuery = js.native
    }
    
    trait JQueryStatic extends StObject {
      
      var livestamp: LivestampGlobal
    }
    object JQueryStatic {
      
      inline def apply(livestamp: LivestampGlobal): JQueryStatic = {
        val __obj = js.Dynamic.literal(livestamp = livestamp.asInstanceOf[js.Any])
        __obj.asInstanceOf[JQueryStatic]
      }
      
      extension [Self <: JQueryStatic](x: Self) {
        
        inline def setLivestamp(value: LivestampGlobal): Self = StObject.set(x, "livestamp", value.asInstanceOf[js.Any])
      }
    }
  }
}
