organization := "org.scalablytyped"
name := "karma-webpack"
version := "2.0-dt-20180712Z-14298b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180214Z-92d399",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-ef7d03",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-99e619",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-0e2c03",
  "org.scalablytyped" %%% "flatted" % "2.0.0-c55f79",
  "org.scalablytyped" %%% "karma" % "3.0-dt-20181203Z-28c112",
  "org.scalablytyped" %%% "log4js" % "4.0.1-5eee37",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20180214Z-7886f3",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20180919Z-e80272",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "source-map" % "0.7.3-4d6b96",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-3bfc94",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-faabb7",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190116Z-dbe32d",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20180709Z-d92493")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        