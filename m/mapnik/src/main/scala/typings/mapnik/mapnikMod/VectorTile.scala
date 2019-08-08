package typings.mapnik.mapnikMod

import typings.mapnik.Anon_Areathreshold
import typings.mapnik.Anon_AreathresholdCallback
import typings.mapnik.Anon_AreathresholdFilltype
import typings.mapnik.Anon_Compression
import typings.mapnik.Anon_Imageformat
import typings.mapnik.Anon_ImageformatImagescaling
import typings.mapnik.Anon_Layer
import typings.mapnik.Anon_Upgrade
import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapnik", "VectorTile")
@js.native
class VectorTile protected () extends js.Object {
  def this(z: Double, x: Double, y: Double) = this()
  def addData(buffer: Buffer): Unit = js.native
  def addData(buffer: Buffer, options: Anon_Upgrade): Unit = js.native
  def addData(buffer: Buffer, options: Anon_Upgrade, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def addDataSync(buffer: Buffer): Unit = js.native
  def addDataSync(buffer: Buffer, options: Anon_Upgrade): Unit = js.native
  def addGeoJSON(geojson: String, name: String): Unit = js.native
  def addGeoJSON(geojson: String, name: String, options: Anon_Areathreshold): Unit = js.native
  def addImage(image: Image, name: String): Unit = js.native
  def addImage(image: Image, name: String, options: Anon_Imageformat): Unit = js.native
  def addImageBuffer(buffer: Buffer, name: String): Unit = js.native
  def addImageBuffer(buffer: Buffer, name: String, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def addImageBufferSync(buffer: Buffer, name: String): Unit = js.native
  def addImageSync(image: Image, name: String): Unit = js.native
  def addImageSync(image: Image, name: String, options: Anon_ImageformatImagescaling): Unit = js.native
  def bufferedExtent(): js.Tuple4[Double, Double, Double, Double] = js.native
  def clear(): Unit = js.native
  def clear(callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def clearSync(): Unit = js.native
  def composite(vectorTiles: js.Array[VectorTile]): Unit = js.native
  def composite(vectorTiles: js.Array[VectorTile], options: Anon_AreathresholdCallback): Unit = js.native
  def compositeSync(vectorTiles: js.Array[VectorTile]): Unit = js.native
  def compositeSync(vectorTiles: js.Array[VectorTile], options: Anon_AreathresholdFilltype): Unit = js.native
  def empty(): Boolean = js.native
  def emptyLayers(): js.Array[String] = js.native
  def extent(): js.Tuple4[Double, Double, Double, Double] = js.native
  def getData(): Unit = js.native
  def getData(options: Anon_Compression): Unit = js.native
  def getData(options: Anon_Compression, callback: js.Function0[Unit]): Unit = js.native
  def getDataSync(): Unit = js.native
  def getDataSync(options: Anon_Compression): Unit = js.native
  def info(buffer: Buffer): Unit = js.native
  def layer(layer_name: String): VectorTile = js.native
  def names(): js.Array[String] = js.native
  def painted(): Boolean = js.native
  def paintedLayers(): js.Array[String] = js.native
  def query(longitude: Double, latitude: Double): Unit = js.native
  def query(longitude: Double, latitude: Double, options: Anon_Layer): Unit = js.native
  def query(
    longitude: Double,
    latitude: Double,
    options: Anon_Layer,
    callback: js.Function2[/* err */ Error, /* features */ js.Array[Feature], Unit]
  ): Unit = js.native
}

