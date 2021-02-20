package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiffBuilder extends StObject {
  
  def getMessage(): String = js.native
  
  def recordMismatch(): Unit = js.native
  def recordMismatch(
    formatter: js.Function4[
      /* actual */ js.Any, 
      /* expected */ js.Any, 
      /* path */ js.UndefOr[js.Any], 
      /* prettyPrinter */ js.UndefOr[js.Any], 
      String
    ]
  ): Unit = js.native
  
  def setRoots(actual: js.Any, expected: js.Any): Unit = js.native
  
  def withPath(pathComponent: String, block: js.Function0[Unit]): Unit = js.native
}
