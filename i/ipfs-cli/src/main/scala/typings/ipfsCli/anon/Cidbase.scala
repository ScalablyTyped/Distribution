package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cidbase extends StObject {
  
  var `cid-base`: Choices
  
  var human: Type
  
  var timeout: CoerceType
}
object Cidbase {
  
  @scala.inline
  def apply(`cid-base`: Choices, human: Type, timeout: CoerceType): Cidbase = {
    val __obj = js.Dynamic.literal(human = human.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.updateDynamic("cid-base")(`cid-base`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cidbase]
  }
  
  @scala.inline
  implicit class CidbaseMutableBuilder[Self <: Cidbase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setCid-base`(value: Choices): Self = StObject.set(x, "cid-base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHuman(value: Type): Self = StObject.set(x, "human", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: CoerceType): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
