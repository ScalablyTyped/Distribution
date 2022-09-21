package typings.makerjs.mod

import typings.makerjs.MakerJs.IKit
import typings.makerjs.MakerJs.IModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kit {
  
  @JSImport("makerjs", "kit")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Helper function to use the JavaScript "apply" function in conjunction with the "new" keyword.
    *
    * @param ctor The constructor for the class which is an IKit.
    * @param args The array of parameters passed to the constructor.
    * @returns A new instance of the class, which implements the IModel interface.
    */
  inline def construct(ctor: IKit, args: Any): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("construct")(ctor.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  /**
    * Extract just the initial sample values from a kit.
    *
    * @param ctor The constructor for the class which is an IKit.
    * @returns Array of the inital sample values provided in the metaParameters array.
    */
  inline def getParameterValues(ctor: IKit): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getParameterValues")(ctor.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
}
