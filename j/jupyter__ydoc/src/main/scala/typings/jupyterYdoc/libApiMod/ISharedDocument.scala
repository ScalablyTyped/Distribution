package typings.jupyterYdoc.libApiMod

import typings.luminoCoreutils.typesJsonMod.JSONObject
import typings.luminoCoreutils.typesJsonMod.JSONValue
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISharedDocument
  extends StObject
     with ISharedBase {
  
  /**
    * The changed signal.
    */
  val changed: ISignal[this.type, DocumentChange] = js.native
  
  /**
    * Get the value for a state attribute
    *
    * @param key Key to get
    */
  def getState(key: String): js.UndefOr[JSONValue] = js.native
  
  /**
    * Set the value of a state attribute
    *
    * @param key Key to set
    * @param value New attribute value
    */
  def setState(key: String, value: JSONValue): Unit = js.native
  
  /**
    * Document state
    */
  val state: JSONObject = js.native
  
  /**
    * Document version
    */
  val version: String = js.native
}
