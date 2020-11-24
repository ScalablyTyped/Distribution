package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrainingOptions extends js.Object {
  
  /** Whether to enable auto ARIMA or not. */
  var autoArima: js.UndefOr[Boolean] = js.native
  
  /** The max value of non-seasonal p and q. */
  var autoArimaMaxOrder: js.UndefOr[String] = js.native
  
  /** Batch size for dnn models. */
  var batchSize: js.UndefOr[String] = js.native
  
  /** The data frequency of a time series. */
  var dataFrequency: js.UndefOr[String] = js.native
  
  /**
    * The column to split data with. This column won't be used as a feature. 1. When data_split_method is CUSTOM, the corresponding column should be boolean. The rows with true value tag
    * are eval data, and the false are training data. 2. When data_split_method is SEQ, the first DATA_SPLIT_EVAL_FRACTION rows (from smallest to largest) in the corresponding column are
    * used as training data, and the rest are eval data. It respects the order in Orderable data types:
    * https://cloud.google.com/bigquery/docs/reference/standard-sql/data-types#data-type-properties
    */
  var dataSplitColumn: js.UndefOr[String] = js.native
  
  /**
    * The fraction of evaluation data over the whole input data. The rest of data will be used as training data. The format should be double. Accurate to two decimal places. Default value
    * is 0.2.
    */
  var dataSplitEvalFraction: js.UndefOr[Double] = js.native
  
  /** The data split type for training and evaluation, e.g. RANDOM. */
  var dataSplitMethod: js.UndefOr[String] = js.native
  
  /** Distance type for clustering models. */
  var distanceType: js.UndefOr[String] = js.native
  
  /** Dropout probability for dnn models. */
  var dropout: js.UndefOr[Double] = js.native
  
  /** Whether to stop early when the loss doesn't improve significantly any more (compared to min_relative_progress). Used only for iterative training algorithms. */
  var earlyStop: js.UndefOr[Boolean] = js.native
  
  /** Feedback type that specifies which algorithm to run for matrix factorization. */
  var feedbackType: js.UndefOr[String] = js.native
  
  /** Hidden units for dnn models. */
  var hiddenUnits: js.UndefOr[js.Array[String]] = js.native
  
  /** The geographical region based on which the holidays are considered in time series modeling. If a valid value is specified, then holiday effects modeling is enabled. */
  var holidayRegion: js.UndefOr[String] = js.native
  
  /** The number of periods ahead that need to be forecasted. */
  var horizon: js.UndefOr[String] = js.native
  
  /** Include drift when fitting an ARIMA model. */
  var includeDrift: js.UndefOr[Boolean] = js.native
  
  /** Specifies the initial learning rate for the line search learn rate strategy. */
  var initialLearnRate: js.UndefOr[Double] = js.native
  
  /** Name of input label columns in training data. */
  var inputLabelColumns: js.UndefOr[js.Array[String]] = js.native
  
  /** Item column specified for matrix factorization models. */
  var itemColumn: js.UndefOr[String] = js.native
  
  /** The column used to provide the initial centroids for kmeans algorithm when kmeans_initialization_method is CUSTOM. */
  var kmeansInitializationColumn: js.UndefOr[String] = js.native
  
  /** The method used to initialize the centroids for kmeans algorithm. */
  var kmeansInitializationMethod: js.UndefOr[String] = js.native
  
  /** L1 regularization coefficient. */
  var l1Regularization: js.UndefOr[Double] = js.native
  
  /** L2 regularization coefficient. */
  var l2Regularization: js.UndefOr[Double] = js.native
  
  /** Weights associated with each label class, for rebalancing the training data. Only applicable for classification models. */
  var labelClassWeights: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: number}
    */ typings.maximMazurokGapiClientBigquery.maximMazurokGapiClientBigqueryStrings.TrainingOptions with TopLevel[js.Any]
  ] = js.native
  
  /** Learning rate in training. Used only for iterative training algorithms. */
  var learnRate: js.UndefOr[Double] = js.native
  
  /** The strategy to determine learn rate for the current iteration. */
  var learnRateStrategy: js.UndefOr[String] = js.native
  
  /** Type of loss function used during training run. */
  var lossType: js.UndefOr[String] = js.native
  
  /** The maximum number of iterations in training. Used only for iterative training algorithms. */
  var maxIterations: js.UndefOr[String] = js.native
  
  /** Maximum depth of a tree for boosted tree models. */
  var maxTreeDepth: js.UndefOr[String] = js.native
  
  /** When early_stop is true, stops training when accuracy improvement is less than 'min_relative_progress'. Used only for iterative training algorithms. */
  var minRelativeProgress: js.UndefOr[Double] = js.native
  
  /** Minimum split loss for boosted tree models. */
  var minSplitLoss: js.UndefOr[Double] = js.native
  
  /** [Beta] Google Cloud Storage URI from which the model was imported. Only applicable for imported models. */
  var modelUri: js.UndefOr[String] = js.native
  
  /** A specification of the non-seasonal part of the ARIMA model: the three components (p, d, q) are the AR order, the degree of differencing, and the MA order. */
  var nonSeasonalOrder: js.UndefOr[ArimaOrder] = js.native
  
  /** Number of clusters for clustering models. */
  var numClusters: js.UndefOr[String] = js.native
  
  /** Num factors specified for matrix factorization models. */
  var numFactors: js.UndefOr[String] = js.native
  
  /** Optimization strategy for training linear regression models. */
  var optimizationStrategy: js.UndefOr[String] = js.native
  
  /**
    * Whether to preserve the input structs in output feature names. Suppose there is a struct A with field b. When false (default), the output feature name is A_b. When true, the output
    * feature name is A.b.
    */
  var preserveInputStructs: js.UndefOr[Boolean] = js.native
  
  /** Subsample fraction of the training data to grow tree to prevent overfitting for boosted tree models. */
  var subsample: js.UndefOr[Double] = js.native
  
  /** Column to be designated as time series data for ARIMA model. */
  var timeSeriesDataColumn: js.UndefOr[String] = js.native
  
  /** The id column that will be used to indicate different time series to forecast in parallel. */
  var timeSeriesIdColumn: js.UndefOr[String] = js.native
  
  /** Column to be designated as time series timestamp for ARIMA model. */
  var timeSeriesTimestampColumn: js.UndefOr[String] = js.native
  
  /** User column specified for matrix factorization models. */
  var userColumn: js.UndefOr[String] = js.native
  
  /** Hyperparameter for matrix factoration when implicit feedback type is specified. */
  var walsAlpha: js.UndefOr[Double] = js.native
  
  /** Whether to train a model from the last checkpoint. */
  var warmStart: js.UndefOr[Boolean] = js.native
}
object TrainingOptions {
  
  @scala.inline
  def apply(): TrainingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingOptions]
  }
  
  @scala.inline
  implicit class TrainingOptionsOps[Self <: TrainingOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoArima(value: Boolean): Self = this.set("autoArima", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoArima: Self = this.set("autoArima", js.undefined)
    
    @scala.inline
    def setAutoArimaMaxOrder(value: String): Self = this.set("autoArimaMaxOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoArimaMaxOrder: Self = this.set("autoArimaMaxOrder", js.undefined)
    
    @scala.inline
    def setBatchSize(value: String): Self = this.set("batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchSize: Self = this.set("batchSize", js.undefined)
    
    @scala.inline
    def setDataFrequency(value: String): Self = this.set("dataFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataFrequency: Self = this.set("dataFrequency", js.undefined)
    
    @scala.inline
    def setDataSplitColumn(value: String): Self = this.set("dataSplitColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSplitColumn: Self = this.set("dataSplitColumn", js.undefined)
    
    @scala.inline
    def setDataSplitEvalFraction(value: Double): Self = this.set("dataSplitEvalFraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSplitEvalFraction: Self = this.set("dataSplitEvalFraction", js.undefined)
    
    @scala.inline
    def setDataSplitMethod(value: String): Self = this.set("dataSplitMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSplitMethod: Self = this.set("dataSplitMethod", js.undefined)
    
    @scala.inline
    def setDistanceType(value: String): Self = this.set("distanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistanceType: Self = this.set("distanceType", js.undefined)
    
    @scala.inline
    def setDropout(value: Double): Self = this.set("dropout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropout: Self = this.set("dropout", js.undefined)
    
    @scala.inline
    def setEarlyStop(value: Boolean): Self = this.set("earlyStop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEarlyStop: Self = this.set("earlyStop", js.undefined)
    
    @scala.inline
    def setFeedbackType(value: String): Self = this.set("feedbackType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeedbackType: Self = this.set("feedbackType", js.undefined)
    
    @scala.inline
    def setHiddenUnitsVarargs(value: String*): Self = this.set("hiddenUnits", js.Array(value :_*))
    
    @scala.inline
    def setHiddenUnits(value: js.Array[String]): Self = this.set("hiddenUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiddenUnits: Self = this.set("hiddenUnits", js.undefined)
    
    @scala.inline
    def setHolidayRegion(value: String): Self = this.set("holidayRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHolidayRegion: Self = this.set("holidayRegion", js.undefined)
    
    @scala.inline
    def setHorizon(value: String): Self = this.set("horizon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizon: Self = this.set("horizon", js.undefined)
    
    @scala.inline
    def setIncludeDrift(value: Boolean): Self = this.set("includeDrift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeDrift: Self = this.set("includeDrift", js.undefined)
    
    @scala.inline
    def setInitialLearnRate(value: Double): Self = this.set("initialLearnRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialLearnRate: Self = this.set("initialLearnRate", js.undefined)
    
    @scala.inline
    def setInputLabelColumnsVarargs(value: String*): Self = this.set("inputLabelColumns", js.Array(value :_*))
    
    @scala.inline
    def setInputLabelColumns(value: js.Array[String]): Self = this.set("inputLabelColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputLabelColumns: Self = this.set("inputLabelColumns", js.undefined)
    
    @scala.inline
    def setItemColumn(value: String): Self = this.set("itemColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemColumn: Self = this.set("itemColumn", js.undefined)
    
    @scala.inline
    def setKmeansInitializationColumn(value: String): Self = this.set("kmeansInitializationColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmeansInitializationColumn: Self = this.set("kmeansInitializationColumn", js.undefined)
    
    @scala.inline
    def setKmeansInitializationMethod(value: String): Self = this.set("kmeansInitializationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmeansInitializationMethod: Self = this.set("kmeansInitializationMethod", js.undefined)
    
    @scala.inline
    def setL1Regularization(value: Double): Self = this.set("l1Regularization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteL1Regularization: Self = this.set("l1Regularization", js.undefined)
    
    @scala.inline
    def setL2Regularization(value: Double): Self = this.set("l2Regularization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteL2Regularization: Self = this.set("l2Regularization", js.undefined)
    
    @scala.inline
    def setLabelClassWeights(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: number}
      */ typings.maximMazurokGapiClientBigquery.maximMazurokGapiClientBigqueryStrings.TrainingOptions with TopLevel[js.Any]
    ): Self = this.set("labelClassWeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelClassWeights: Self = this.set("labelClassWeights", js.undefined)
    
    @scala.inline
    def setLearnRate(value: Double): Self = this.set("learnRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLearnRate: Self = this.set("learnRate", js.undefined)
    
    @scala.inline
    def setLearnRateStrategy(value: String): Self = this.set("learnRateStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLearnRateStrategy: Self = this.set("learnRateStrategy", js.undefined)
    
    @scala.inline
    def setLossType(value: String): Self = this.set("lossType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLossType: Self = this.set("lossType", js.undefined)
    
    @scala.inline
    def setMaxIterations(value: String): Self = this.set("maxIterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxIterations: Self = this.set("maxIterations", js.undefined)
    
    @scala.inline
    def setMaxTreeDepth(value: String): Self = this.set("maxTreeDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTreeDepth: Self = this.set("maxTreeDepth", js.undefined)
    
    @scala.inline
    def setMinRelativeProgress(value: Double): Self = this.set("minRelativeProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinRelativeProgress: Self = this.set("minRelativeProgress", js.undefined)
    
    @scala.inline
    def setMinSplitLoss(value: Double): Self = this.set("minSplitLoss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSplitLoss: Self = this.set("minSplitLoss", js.undefined)
    
    @scala.inline
    def setModelUri(value: String): Self = this.set("modelUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelUri: Self = this.set("modelUri", js.undefined)
    
    @scala.inline
    def setNonSeasonalOrder(value: ArimaOrder): Self = this.set("nonSeasonalOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonSeasonalOrder: Self = this.set("nonSeasonalOrder", js.undefined)
    
    @scala.inline
    def setNumClusters(value: String): Self = this.set("numClusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumClusters: Self = this.set("numClusters", js.undefined)
    
    @scala.inline
    def setNumFactors(value: String): Self = this.set("numFactors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumFactors: Self = this.set("numFactors", js.undefined)
    
    @scala.inline
    def setOptimizationStrategy(value: String): Self = this.set("optimizationStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimizationStrategy: Self = this.set("optimizationStrategy", js.undefined)
    
    @scala.inline
    def setPreserveInputStructs(value: Boolean): Self = this.set("preserveInputStructs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveInputStructs: Self = this.set("preserveInputStructs", js.undefined)
    
    @scala.inline
    def setSubsample(value: Double): Self = this.set("subsample", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubsample: Self = this.set("subsample", js.undefined)
    
    @scala.inline
    def setTimeSeriesDataColumn(value: String): Self = this.set("timeSeriesDataColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeSeriesDataColumn: Self = this.set("timeSeriesDataColumn", js.undefined)
    
    @scala.inline
    def setTimeSeriesIdColumn(value: String): Self = this.set("timeSeriesIdColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeSeriesIdColumn: Self = this.set("timeSeriesIdColumn", js.undefined)
    
    @scala.inline
    def setTimeSeriesTimestampColumn(value: String): Self = this.set("timeSeriesTimestampColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeSeriesTimestampColumn: Self = this.set("timeSeriesTimestampColumn", js.undefined)
    
    @scala.inline
    def setUserColumn(value: String): Self = this.set("userColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserColumn: Self = this.set("userColumn", js.undefined)
    
    @scala.inline
    def setWalsAlpha(value: Double): Self = this.set("walsAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWalsAlpha: Self = this.set("walsAlpha", js.undefined)
    
    @scala.inline
    def setWarmStart(value: Boolean): Self = this.set("warmStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarmStart: Self = this.set("warmStart", js.undefined)
  }
}
