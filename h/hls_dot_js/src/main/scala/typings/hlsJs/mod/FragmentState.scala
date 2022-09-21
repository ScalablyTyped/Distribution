package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FragmentState extends StObject
@JSImport("hls.js", "FragmentState")
@js.native
object FragmentState extends StObject {
  
  @js.native
  sealed trait APPENDING
    extends StObject
       with FragmentState
  
  @js.native
  sealed trait NOT_LOADED
    extends StObject
       with FragmentState
  
  @js.native
  sealed trait OK
    extends StObject
       with FragmentState
  
  @js.native
  sealed trait PARTIAL
    extends StObject
       with FragmentState
}
