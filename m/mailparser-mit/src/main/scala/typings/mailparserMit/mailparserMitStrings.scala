package typings.mailparserMit

import typings.mailparserMit.mod.Priority
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mailparserMitStrings {
  
  @js.native
  sealed trait attachment extends StObject
  inline def attachment: attachment = "attachment".asInstanceOf[attachment]
  
  @js.native
  sealed trait end extends StObject
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait headers extends StObject
  inline def headers: headers = "headers".asInstanceOf[headers]
  
  @js.native
  sealed trait high
    extends StObject
       with Priority
  inline def high: high = "high".asInstanceOf[high]
  
  @js.native
  sealed trait low
    extends StObject
       with Priority
  inline def low: low = "low".asInstanceOf[low]
  
  @js.native
  sealed trait normal
    extends StObject
       with Priority
  inline def normal: normal = "normal".asInstanceOf[normal]
}
