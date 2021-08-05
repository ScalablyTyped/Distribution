package typings.html5History

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("html5-history", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCurrentIndex(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentIndex")().asInstanceOf[Double]
  
  inline def getHash(doc: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getHash")(doc.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def getState(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getState")().asInstanceOf[js.Any]
  inline def getState(friendly: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getState")(friendly.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def getState(friendly: js.Any, create: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getState")(friendly.asInstanceOf[js.Any], create.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def getState(friendly: Unit, create: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getState")(friendly.asInstanceOf[js.Any], create.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def getStateByIndex(index: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getStateByIndex")(index.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def init(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Boolean]
  inline def init(options: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def normalizeHash(hash: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeHash")(hash.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def setHash(hash: js.Any, queue: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setHash")(hash.asInstanceOf[js.Any], queue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def unescapeHash(hash: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapeHash")(hash.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
