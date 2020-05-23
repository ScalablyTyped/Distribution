organization := "org.scalablytyped"
name := "libnpmsearch"
version := "2.0-dt-20190926Z-3b82cf"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "form-data" % "3.0.0-81582a",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "node-fetch" % "2.5-dt-20200515Z-259236",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20200515Z-222506",
  "org.scalablytyped" %%% "npm-registry-fetch" % "8.0-dt-20200323Z-f1d559",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20190626Z-20e74a",
  "org.scalablytyped" %%% "ssri" % "6.0-dt-20200515Z-caedca",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
