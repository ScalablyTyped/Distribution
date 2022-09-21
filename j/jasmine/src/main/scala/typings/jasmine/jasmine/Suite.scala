package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Suite
  extends StObject
     with Spec {
  
  var children: js.Array[Spec | Suite] = js.native
  
  var parentSuite: Suite = js.native
}
