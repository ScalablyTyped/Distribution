package typings.hirestime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hirestime", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default(): Elapsor = js.native
  
  def hiresTimeBrowserDate(): Elapsor = js.native
  
  def hiresTimeBrowserPerformance(): Elapsor = js.native
  
  def hirestimeNode(): Elapsor = js.native
  
  @js.native
  trait Elapsor extends js.Object {
    
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
