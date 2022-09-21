organization := "org.scalablytyped"
name := "mali"
version := "0.47.1-1d0199"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.0-db6617",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-7b2a61",
  "org.scalablytyped" %%% "long" % "5.2.0-13a867",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "protobufjs" % "7.1.1-ba42e8",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
