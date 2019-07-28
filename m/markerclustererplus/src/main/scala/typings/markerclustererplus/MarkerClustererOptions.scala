package typings.markerclustererplus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Optional parameter passed to the {@link MarkerClusterer} constructor.
  */
trait MarkerClustererOptions extends js.Object {
  /**
    * [averageCenter=false] Whether the position of a cluster marker should be
    * the average position of all markers in the cluster. If set to <code>false</code>, the
    * cluster marker is positioned at the location of the first marker added to the cluster.
    */
  var averageCenter: js.UndefOr[Boolean] = js.undefined
  /**
    * [batchSize=MarkerClusterer.BATCH_SIZE] Set this property to the
    * number of markers to be processed in a single batch when using a browser other than
    * Internet Explorer (for Internet Explorer, use the batchSizeIE property instead).
    */
  var batchSize: js.UndefOr[Double] = js.undefined
  /**
    * [batchSizeIE=MarkerClusterer.BATCH_SIZE_IE] When Internet Explorer is
    * being used, markers are processed in several batches with a small delay inserted between
    * each batch in an attempt to avoid Javascript timeout errors. Set this property to the
    * number of markers to be processed in a single batch; select as high a number as you can
    * without causing a timeout error in the browser. This number might need to be as low as 100
    * if 15,000 markers are being managed, for example.
    */
  var batchSizeIE: js.UndefOr[Double] = js.undefined
  /**
    * [calculator=MarkerClusterer.CALCULATOR] The function used to determine
    * the text to be displayed on a cluster marker and the index indicating which style to use
    * for the cluster marker. The input parameters for the function are (1) the array of markers
    * represented by a cluster marker and (2) the number of cluster icon styles. It returns a
    * {@link ClusterIconInfo} object. The default <code>calculator</code> returns a
    * <code>text</code> property which is the number of markers in the cluster and an
    * <code>index</code> property which is one higher than the lowest integer such that
    * <code>10^i</code> exceeds the number of markers in the cluster, or the size of the styles
    * array, whichever is less. The <code>styles</code> array element used has an index of
    * <code>index</code> minus 1. For example, the default <code>calculator</code> returns a
    * <code>text</code> value of <code>"125"</code> and an <code>index</code> of <code>3</code>
    * for a cluster icon representing 125 markers so the element used in the <code>styles</code>
    * array is <code>2</code>. A <code>calculator</code> may also return a <code>title</code>
    * property that contains the text of the tooltip to be used for the cluster marker. If
    * <code>title</code> is not defined, the tooltip is set to the value of the <code>title</code>
    * property for the MarkerClusterer.
    */
  var calculator: js.UndefOr[Calculator] = js.undefined
  /**
    * [clusterClass="cluster"] The name of the CSS class defining general styles
    * for the cluster markers. Use this class to define CSS styles that are not set up by the code
    * that processes the <code>styles</code> array.
    */
  var clusterClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [enableRetinaIcons=false] Whether to allow the use of cluster icons that
    * have sizes that are some multiple (typically double) of their actual display size. Icons such
    * as these look better when viewed on high-resolution monitors such as Apple's Retina displays.
    * Note: if this property is <code>true</code>, sprites cannot be used as cluster icons.
    */
  var enableRetinaIcons: js.UndefOr[Boolean] = js.undefined
  /** [gridSize=60] The grid size of a cluster in pixels. The grid is a square. */
  var gridSize: js.UndefOr[Double] = js.undefined
  /**
    * [ignoreHidden=false] Whether to ignore hidden markers in clusters. You
    * may want to set this to <code>true</code> to ensure that hidden markers are not included
    * in the marker count that appears on a cluster marker (this count is the value of the
    * <code>text</code> property of the result returned by the default <code>calculator</code>).
    * If set to <code>true</code> and you change the visibility of a marker being clustered, be
    * sure to also call <code>MarkerClusterer.repaint()</code>.
    */
  var ignoreHidden: js.UndefOr[Boolean] = js.undefined
  /**
    * [imageExtension=MarkerClusterer.IMAGE_EXTENSION]
    * The extension name for the cluster icon image files (e.g., <code>"png"</code> or
    * <code>"jpg"</code>).
    */
  var imageExtension: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [imagePath=MarkerClusterer.IMAGE_PATH]
    * The full URL of the root name of the group of image files to use for cluster icons.
    * The complete file name is of the form <code>imagePath</code>n.<code>imageExtension</code>
    * where n is the image file number (1, 2, etc.).
    */
  var imagePath: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [imageSizes=MarkerClusterer.IMAGE_SIZES]
    * An array of numbers containing the widths of the group of
    * <code>imagePath</code>n.<code>imageExtension</code> image files.
    * (The images are assumed to be square.)
    */
  var imageSizes: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * [maxZoom=null] The maximum zoom level at which clustering is enabled or
    * <code>null</code> if clustering is to be enabled at all zoom levels.
    */
  var maxZoom: js.UndefOr[Double] = js.undefined
  /**
    * [minimumClusterSize=2] The minimum number of markers needed in a cluster
    * before the markers are hidden and a cluster marker appears.
    */
  var minimumClusterSize: js.UndefOr[Double] = js.undefined
  /**
    * [styles] An array of {@link ClusterIconStyle} elements defining the styles
    * of the cluster markers to be used. The element to be used to style a given cluster marker
    * is determined by the function defined by the <code>calculator</code> property.
    * The default is an array of {@link ClusterIconStyle} elements whose properties are derived
    * from the values for <code>imagePath</code>, <code>imageExtension</code>, and
    * <code>imageSizes</code>.
    */
  var styles: js.UndefOr[js.Array[ClusterIconStyle]] = js.undefined
  /**
    * [title=""] The tooltip to display when the mouse moves over a cluster
    * marker. (Alternatively, you can use a custom <code>calculator</code> function to specify a
    * different tooltip for each cluster marker.)
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [zoomOnClick=true] Whether to zoom the map when a cluster marker is
    * clicked. You may want to set this to <code>false</code> if you have installed a handler
    * for the <code>click</code> event and it deals with zooming on its own.
    */
  var zoomOnClick: js.UndefOr[Boolean] = js.undefined
}

object MarkerClustererOptions {
  @scala.inline
  def apply(
    averageCenter: js.UndefOr[Boolean] = js.undefined,
    batchSize: Int | Double = null,
    batchSizeIE: Int | Double = null,
    calculator: Calculator = null,
    clusterClass: java.lang.String = null,
    enableRetinaIcons: js.UndefOr[Boolean] = js.undefined,
    gridSize: Int | Double = null,
    ignoreHidden: js.UndefOr[Boolean] = js.undefined,
    imageExtension: java.lang.String = null,
    imagePath: java.lang.String = null,
    imageSizes: js.Array[Double] = null,
    maxZoom: Int | Double = null,
    minimumClusterSize: Int | Double = null,
    styles: js.Array[ClusterIconStyle] = null,
    title: java.lang.String = null,
    zoomOnClick: js.UndefOr[Boolean] = js.undefined
  ): MarkerClustererOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(averageCenter)) __obj.updateDynamic("averageCenter")(averageCenter)
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (batchSizeIE != null) __obj.updateDynamic("batchSizeIE")(batchSizeIE.asInstanceOf[js.Any])
    if (calculator != null) __obj.updateDynamic("calculator")(calculator)
    if (clusterClass != null) __obj.updateDynamic("clusterClass")(clusterClass)
    if (!js.isUndefined(enableRetinaIcons)) __obj.updateDynamic("enableRetinaIcons")(enableRetinaIcons)
    if (gridSize != null) __obj.updateDynamic("gridSize")(gridSize.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreHidden)) __obj.updateDynamic("ignoreHidden")(ignoreHidden)
    if (imageExtension != null) __obj.updateDynamic("imageExtension")(imageExtension)
    if (imagePath != null) __obj.updateDynamic("imagePath")(imagePath)
    if (imageSizes != null) __obj.updateDynamic("imageSizes")(imageSizes)
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minimumClusterSize != null) __obj.updateDynamic("minimumClusterSize")(minimumClusterSize.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(zoomOnClick)) __obj.updateDynamic("zoomOnClick")(zoomOnClick)
    __obj.asInstanceOf[MarkerClustererOptions]
  }
}

