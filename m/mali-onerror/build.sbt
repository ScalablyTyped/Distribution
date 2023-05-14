organization := "org.scalablytyped"
name := "mali-onerror"
version := "0.2.0-abb62f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.8.14-57be43",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.7-8bbfd9",
  "org.scalablytyped" %%% "mali" % "0.47.1-3ce250",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "protobufjs" % "7.2.3-99c136",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
