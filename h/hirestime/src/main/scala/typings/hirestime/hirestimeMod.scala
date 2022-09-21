package typings.hirestime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hirestimeMod {
  
  @JSImport("hirestime/dist/hirestime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Elapsor = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Elapsor]
  
  inline def hiresTimeBrowserDate(): Elapsor = ^.asInstanceOf[js.Dynamic].applyDynamic("hiresTimeBrowserDate")().asInstanceOf[Elapsor]
  
  inline def hiresTimeBrowserPerformance(): Elapsor = ^.asInstanceOf[js.Dynamic].applyDynamic("hiresTimeBrowserPerformance")().asInstanceOf[Elapsor]
  
  inline def hirestimeNode(): Elapsor = ^.asInstanceOf[js.Dynamic].applyDynamic("hirestimeNode")().asInstanceOf[Elapsor]
  
  @js.native
  trait Elapsor extends StObject {
    
    def apply(): Double = js.native
    
    def microseconds(): Double = js.native
    
    def milliseconds(): Double = js.native
    
    def ms(): Double = js.native
    
    def nanoseconds(): Double = js.native
    
    def ns(): Double = js.native
    
    def s(): Double = js.native
    
    def seconds(): Double = js.native
    
    def startedAt(): Double = js.native
    
    def us(): Double = js.native
  }
}
