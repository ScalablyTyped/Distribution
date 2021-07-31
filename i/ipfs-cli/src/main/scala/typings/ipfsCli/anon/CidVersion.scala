package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CidVersion extends StObject {
  
  var cidBase: js.Any
  
  var cidVersion: js.Any
  
  var ctx: Ipfs
  
  var data: js.Any
  
  var format: js.Any
  
  var hashAlg: js.Any
  
  var inputEncoding: js.Any
  
  var onlyHash: js.Any
  
  var pin: js.Any
  
  var preload: js.Any
  
  var timeout: js.Any
}
object CidVersion {
  
  @scala.inline
  def apply(
    cidBase: js.Any,
    cidVersion: js.Any,
    ctx: Ipfs,
    data: js.Any,
    format: js.Any,
    hashAlg: js.Any,
    inputEncoding: js.Any,
    onlyHash: js.Any,
    pin: js.Any,
    preload: js.Any,
    timeout: js.Any
  ): CidVersion = {
    val __obj = js.Dynamic.literal(cidBase = cidBase.asInstanceOf[js.Any], cidVersion = cidVersion.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], hashAlg = hashAlg.asInstanceOf[js.Any], inputEncoding = inputEncoding.asInstanceOf[js.Any], onlyHash = onlyHash.asInstanceOf[js.Any], pin = pin.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CidVersion]
  }
  
  @scala.inline
  implicit class CidVersionMutableBuilder[Self <: CidVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidBase(value: js.Any): Self = StObject.set(x, "cidBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidVersion(value: js.Any): Self = StObject.set(x, "cidVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtx(value: Ipfs): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: js.Any): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashAlg(value: js.Any): Self = StObject.set(x, "hashAlg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputEncoding(value: js.Any): Self = StObject.set(x, "inputEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyHash(value: js.Any): Self = StObject.set(x, "onlyHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPin(value: js.Any): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreload(value: js.Any): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
