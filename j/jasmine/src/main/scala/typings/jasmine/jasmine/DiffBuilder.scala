package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @deprecated Private type that may be changed or removed in the future
  */
@js.native
trait DiffBuilder extends StObject {
  
  def getMessage(): String = js.native
  
  def recordMismatch(): Unit = js.native
  def recordMismatch(
    formatter: js.Function4[
      /* actual */ scala.Any, 
      /* expected */ scala.Any, 
      /* path */ js.UndefOr[scala.Any], 
      /* prettyPrinter */ js.UndefOr[scala.Any], 
      String
    ]
  ): Unit = js.native
  
  def setRoots(actual: scala.Any, expected: scala.Any): Unit = js.native
  
  def withPath(pathComponent: String, block: js.Function0[Unit]): Unit = js.native
}
