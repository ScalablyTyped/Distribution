package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockSize extends js.Object {
  
  var BlockSize: js.Any = js.native
  
  var CumulativeSize: js.Any = js.native
  
  var DataSize: js.Any = js.native
  
  var Hash: js.Any = js.native
  
  var LinksSize: Double = js.native
  
  var NumLinks: js.Any = js.native
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
  implicit class BlockSizeOps[Self <: BlockSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlockSize(value: js.Any): Self = this.set("BlockSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCumulativeSize(value: js.Any): Self = this.set("CumulativeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSize(value: js.Any): Self = this.set("DataSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: js.Any): Self = this.set("Hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksSize(value: Double): Self = this.set("LinksSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumLinks(value: js.Any): Self = this.set("NumLinks", value.asInstanceOf[js.Any])
  }
}
