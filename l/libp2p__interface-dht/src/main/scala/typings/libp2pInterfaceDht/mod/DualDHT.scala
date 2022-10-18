package typings.libp2pInterfaceDht.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DualDHT extends DHT {
  
  var lan: SingleDHT = js.native
  
  var wan: SingleDHT = js.native
}
