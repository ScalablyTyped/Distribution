package typings.makerjs.MakerJs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An IKit is a model-producing class with some sample parameters. Think of it as a packaged model with instructions on how to best use it.
  */
@js.native
trait IKit
  extends StObject
     with /**
  * The constructor. The kit must be "new-able" and it must produce an IModel.
  * It can have any number of any type of parameters.
  */
Instantiable1[/* args (repeated) */ Any, IModel] {
  
  /**
    * Attached to the constructor is a property named metaParameters which is an array of IMetaParameter objects.
    * Each element of the array corresponds to a parameter of the constructor, in order.
    */
  var metaParameters: js.UndefOr[js.Array[IMetaParameter]] = js.native
  
  /**
    * Information about this kit, in plain text or markdown format.
    */
  var notes: js.UndefOr[String] = js.native
}
