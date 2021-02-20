package typings.hirestime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hirestime", JSImport.Default)
  @js.native
  def default(): Elapsor = js.native
  
  @JSImport("hirestime", "hiresTimeBrowserDate")
  @js.native
  def hiresTimeBrowserDate(): Elapsor = js.native
  
  @JSImport("hirestime", "hiresTimeBrowserPerformance")
  @js.native
  def hiresTimeBrowserPerformance(): Elapsor = js.native
  
  @JSImport("hirestime", "hirestimeNode")
  @js.native
  def hirestimeNode(): Elapsor = js.native
  
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
