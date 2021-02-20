package typings.makerJs.global.MakerJs

import typings.makerJs.MakerJs.IKit
import typings.makerJs.MakerJs.IModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kit {
  
  /**
    * Helper function to use the JavaScript "apply" function in conjunction with the "new" keyword.
    *
    * @param ctor The constructor for the class which is an IKit.
    * @param args The array of parameters passed to the constructor.
    * @returns A new instance of the class, which implements the IModel interface.
    */
  @JSGlobal("MakerJs.kit.construct")
  @js.native
  def construct(ctor: IKit, args: js.Any): IModel = js.native
  
  /**
    * Extract just the initial sample values from a kit.
    *
    * @param ctor The constructor for the class which is an IKit.
    * @returns Array of the inital sample values provided in the metaParameters array.
    */
  @JSGlobal("MakerJs.kit.getParameterValues")
  @js.native
  def getParameterValues(ctor: IKit): js.Array[_] = js.native
}
