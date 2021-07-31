package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockSize extends StObject {
  
  var BlockSize: js.Any
  
  var CumulativeSize: js.Any
  
  var DataSize: js.Any
  
  var Hash: js.Any
  
  var LinksSize: Double
  
  var NumLinks: js.Any
}
object BlockSize {
  
  @scala.inline
  def apply(
    BlockSize: js.Any,
    CumulativeSize: js.Any,
    DataSize: js.Any,
    Hash: js.Any,
    LinksSize: Double,
    NumLinks: js.Any
  ): BlockSize = {
    val __obj = js.Dynamic.literal(BlockSize = BlockSize.asInstanceOf[js.Any], CumulativeSize = CumulativeSize.asInstanceOf[js.Any], DataSize = DataSize.asInstanceOf[js.Any], Hash = Hash.asInstanceOf[js.Any], LinksSize = LinksSize.asInstanceOf[js.Any], NumLinks = NumLinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockSize]
  }
  
  @scala.inline
  implicit class BlockSizeMutableBuilder[Self <: BlockSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockSize(value: js.Any): Self = StObject.set(x, "BlockSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCumulativeSize(value: js.Any): Self = StObject.set(x, "CumulativeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSize(value: js.Any): Self = StObject.set(x, "DataSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: js.Any): Self = StObject.set(x, "Hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksSize(value: Double): Self = StObject.set(x, "LinksSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumLinks(value: js.Any): Self = StObject.set(x, "NumLinks", value.asInstanceOf[js.Any])
  }
}
