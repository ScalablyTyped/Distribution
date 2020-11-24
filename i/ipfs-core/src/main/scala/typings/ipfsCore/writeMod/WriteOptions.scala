package typings.ipfsCore.writeMod

import typings.ipfsCore.ipfsCoreNumbers.`0`
import typings.ipfsCore.ipfsCoreNumbers.`1`
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteOptions extends js.Object {
  
  /**
    * - The CID version to use for any updated entries
    */
  var cidVersion: js.UndefOr[`0` | `1`] = js.native
  
  /**
    * - Create the MFS path if it does not exist
    */
  var create: js.UndefOr[Boolean] = js.native
  
  /**
    * - If true the changes will be immediately flushed to disk
    */
  var flush: js.UndefOr[Boolean] = js.native
  
  /**
    * - The hash algorithm to use for any updated entries
    */
  var hashAlg: js.UndefOr[String] = js.native
  
  /**
    * - Optionally limit how many bytes are read from the stream
    */
  var length: js.UndefOr[Double] = js.native
  
  /**
    * - An integer that represents the file mode
    */
  var mode: js.UndefOr[Double] = js.native
  
  /**
    * - A Date object, an object with `{ secs, nsecs }` properties where secs is the number of seconds since (positive) or before (negative) the Unix Epoch began and nsecs is the number of nanoseconds since the last full second, or the output of `process.hrtime()
    */
  var mtime: js.UndefOr[Date | typings.ipfsCore.srcUtilsMod.Mtime | (js.Tuple2[Double, Double])] = js.native
  
  /**
    * - An offset to start writing to file at
    */
  var offset: js.UndefOr[Double] = js.native
  
  /**
    * - Create intermediate MFS paths if they do not exist
    */
  var parents: js.UndefOr[Boolean] = js.native
  
  /**
    * - If true, DAG leaves will contain raw file data and not be wrapped in a protobuf
    */
  var rawLeaves: js.UndefOr[Boolean] = js.native
  
  /**
    * - Truncate the file at the MFS path if it would have been larger than the passed content
    */
  var truncate: js.UndefOr[Boolean] = js.native
}
object WriteOptions {
  
  @scala.inline
  def apply(): WriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteOptions]
  }
  
  @scala.inline
  implicit class WriteOptionsOps[Self <: WriteOptions] (val x: Self) extends AnyVal {
    
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
    def setCidVersion(value: `0` | `1`): Self = this.set("cidVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCidVersion: Self = this.set("cidVersion", js.undefined)
    
    @scala.inline
    def setCreate(value: Boolean): Self = this.set("create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setFlush(value: Boolean): Self = this.set("flush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlush: Self = this.set("flush", js.undefined)
    
    @scala.inline
    def setHashAlg(value: String): Self = this.set("hashAlg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashAlg: Self = this.set("hashAlg", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setMtime(value: Date | typings.ipfsCore.srcUtilsMod.Mtime | (js.Tuple2[Double, Double])): Self = this.set("mtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMtime: Self = this.set("mtime", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setParents(value: Boolean): Self = this.set("parents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParents: Self = this.set("parents", js.undefined)
    
    @scala.inline
    def setRawLeaves(value: Boolean): Self = this.set("rawLeaves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawLeaves: Self = this.set("rawLeaves", js.undefined)
    
    @scala.inline
    def setTruncate(value: Boolean): Self = this.set("truncate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTruncate: Self = this.set("truncate", js.undefined)
  }
}
