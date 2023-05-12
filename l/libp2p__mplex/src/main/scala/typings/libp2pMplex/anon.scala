package typings.libp2pMplex

import typings.libp2pMplex.distSrcMessageTypesMod.NAME
import typings.libp2pMplex.distSrcMplexMod.MplexStream
import typings.libp2pMplex.libp2pMplexStrings.initiator
import typings.libp2pMplex.libp2pMplexStrings.receiver
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Id extends StObject {
    
    var id: Double
    
    var name: String
  }
  object Id {
    
    inline def apply(id: Double, name: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var id: Double
    
    var name: String
    
    var registry: Map[Double, MplexStream]
    
    var `type`: initiator | receiver
  }
  object Name {
    
    inline def apply(id: Double, name: String, registry: Map[Double, MplexStream], `type`: initiator | receiver): Name = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRegistry(value: Map[Double, MplexStream]): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setType(value: initiator | receiver): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Record<@libp2p/mplex.@libp2p/mplex/dist/src/message-types.CODE, @libp2p/mplex.@libp2p/mplex/dist/src/message-types.NAME> */
  trait RecordCODENAME extends StObject {
    
    var `0`: NAME
    
    var `1`: NAME
    
    var `2`: NAME
    
    var `3`: NAME
    
    var `4`: NAME
    
    var `5`: NAME
    
    var `6`: NAME
  }
  object RecordCODENAME {
    
    inline def apply(`0`: NAME, `1`: NAME, `2`: NAME, `3`: NAME, `4`: NAME, `5`: NAME, `6`: NAME): RecordCODENAME = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
      __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
      __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
      __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
      __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
      __obj.updateDynamic("5")(`5`.asInstanceOf[js.Any])
      __obj.updateDynamic("6")(`6`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordCODENAME]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RecordCODENAME] (val x: Self) extends AnyVal {
      
      inline def set0(value: NAME): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      inline def set1(value: NAME): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      inline def set2(value: NAME): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
      
      inline def set3(value: NAME): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
      
      inline def set4(value: NAME): Self = StObject.set(x, "4", value.asInstanceOf[js.Any])
      
      inline def set5(value: NAME): Self = StObject.set(x, "5", value.asInstanceOf[js.Any])
      
      inline def set6(value: NAME): Self = StObject.set(x, "6", value.asInstanceOf[js.Any])
    }
  }
}
