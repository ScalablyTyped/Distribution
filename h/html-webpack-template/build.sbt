organization := "org.scalablytyped"
name := "html-webpack-template"
version := "6.0-dt-20200515Z-135cea"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "html-minifier-terser" % "5.1-dt-20200504Z-d46183",
  "org.scalablytyped" %%% "html-webpack-plugin" % "4.3.0-117542",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20200616Z-fc7751")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
