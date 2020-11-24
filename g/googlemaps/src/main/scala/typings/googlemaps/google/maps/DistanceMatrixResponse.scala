package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response to a {@link DistanceMatrixService} request, consisting of the formatted origin and destination
  * addresses, and a sequence of {@link DistanceMatrixResponseRow}s, one for each corresponding origin address.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixResponse Maps JavaScript API}
  */
@js.native
trait DistanceMatrixResponse extends js.Object {
  
  /**
    * The formatted destination addresses.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixResponse.destinationAddresses Maps JavaScript API}
    */
  var destinationAddresses: js.Array[String] = js.native
  
  /**
    * The formatted origin addresses.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixResponse.originAddresses Maps JavaScript API}
    */
  var originAddresses: js.Array[String] = js.native
  
  /**
    * The rows of the matrix, corresponding to the origin addresses.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixResponse.rows Maps JavaScript API}
    */
  var rows: js.Array[DistanceMatrixResponseRow] = js.native
}
object DistanceMatrixResponse {
  
  @scala.inline
  def apply(
    destinationAddresses: js.Array[String],
    originAddresses: js.Array[String],
    rows: js.Array[DistanceMatrixResponseRow]
  ): DistanceMatrixResponse = {
    val __obj = js.Dynamic.literal(destinationAddresses = destinationAddresses.asInstanceOf[js.Any], originAddresses = originAddresses.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceMatrixResponse]
  }
  
  @scala.inline
  implicit class DistanceMatrixResponseOps[Self <: DistanceMatrixResponse] (val x: Self) extends AnyVal {
    
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
    def setDestinationAddressesVarargs(value: String*): Self = this.set("destinationAddresses", js.Array(value :_*))
    
    @scala.inline
    def setDestinationAddresses(value: js.Array[String]): Self = this.set("destinationAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginAddressesVarargs(value: String*): Self = this.set("originAddresses", js.Array(value :_*))
    
    @scala.inline
    def setOriginAddresses(value: js.Array[String]): Self = this.set("originAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsVarargs(value: DistanceMatrixResponseRow*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[DistanceMatrixResponseRow]): Self = this.set("rows", value.asInstanceOf[js.Any])
  }
}
