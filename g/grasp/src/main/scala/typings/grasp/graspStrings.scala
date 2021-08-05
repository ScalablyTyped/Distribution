package typings.grasp

import typings.grasp.mod.QueryEngineType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graspStrings {
  
  @js.native
  sealed trait buffer extends StObject
  inline def buffer: buffer = "buffer".asInstanceOf[buffer]
  
  @js.native
  sealed trait equery
    extends StObject
       with QueryEngineType
  inline def equery: equery = "equery".asInstanceOf[equery]
  
  @js.native
  sealed trait squery
    extends StObject
       with QueryEngineType
  inline def squery: squery = "squery".asInstanceOf[squery]
}
